import { render, screen, fireEvent } from '@testing-library/react';
import LoginForm from "./LoginForm";

test('renders the login form correctly', () => {
    render(<LoginForm onSubmit={jest.fn()} />);
    expect(screen.getByLabelText(/email/i)).toBeInTheDocument();
    expect(screen.getByLabelText(/password/i)).toBeInTheDocument();
    expect(screen.getByRole('button', { name: /submit/i })).toBeInTheDocument();
  });

  test('displays an error when the email is invalid', async () => {
    render(<LoginForm onSubmit={jest.fn()} />);
    fireEvent.change(screen.getByLabelText(/email/i), { target: { value: 'invalid' } });
    fireEvent.click(screen.getByRole('button', { name: /submit/i }));
    expect(await screen.findByText(/email is invalid/i)).toBeInTheDocument();
  });
  
  test('displays an error when the password is not provided', async () => {
    render(<LoginForm onSubmit={jest.fn()} />);
    fireEvent.change(screen.getByLabelText(/email/i), { target: { value: 'test@example.com' } });
    fireEvent.change(screen.getByLabelText(/password/i), { target: { value: '' } });
    fireEvent.click(screen.getByRole('button', { name: /submit/i }));
    expect(await screen.findByText(/password is required/i)).toBeInTheDocument();
  });
  
  test('displays an error when the Email is not provided', async () => {
    render(<LoginForm onSubmit={jest.fn()} />);
    fireEvent.change(screen.getByLabelText(/email/i), { target: { value: '' } });
    // fireEvent.change(screen.getByLabelText(/password/i), { target: { value: '' } });
    fireEvent.click(screen.getByRole('button', { name: /submit/i }));
    expect(await screen.findByText(/Email is required/i)).toBeInTheDocument();
  });
  
  test('submits form with valid inputs', async () => {
    const mockSubmit = jest.fn();
    render(<LoginForm onSubmit={mockSubmit} />);
    fireEvent.change(screen.getByLabelText(/email/i), { target: { value: 'test@example.com' } });
    fireEvent.change(screen.getByLabelText(/password/i), { target: { value: 'password123' } });
    fireEvent.click(screen.getByRole('button', { name: /submit/i }));
    expect(mockSubmit).toHaveBeenCalledWith({
      email: 'test@example.com',
      password: 'password123',
    });
  });