import React from 'react';
// import axios from 'axios';
import { render, fireEvent, screen } from '@testing-library/react';
// import '@testing-library/jest-dom/extend-expect';
import RegistrationForm from './RegistrationForm';


test('renders form and submits data', () => {
    render(<RegistrationForm />);
  
    // Check if form elements are rendered
    const nameInput = screen.getByLabelText(/name/i);
    const emailInput = screen.getByLabelText(/email/i);
    const submitButton = screen.getByText(/submit/i);
  
    expect(nameInput).toBeInTheDocument();
    expect(emailInput).toBeInTheDocument();
    expect(submitButton).toBeInTheDocument();
  
    // Simulate user input
    fireEvent.change(nameInput, { target: { value: 'Prasanna P' } });
    fireEvent.change(emailInput, { target: { value: 'prassucp@gmail.com' } });
  
    // Check if input values are updated
    expect(nameInput.value).toBe('Prasanna P');
    expect(emailInput.value).toBe('prassucp@gmail.com');
  
    // Simulate form submission
    fireEvent.click(submitButton);
  
    // You can add more assertions here to check form submission behavior
  });