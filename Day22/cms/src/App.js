import logo from './logo.svg';
import './App.css';
import HomePage from './components/homepage/homepage';
import CustomerLogin from './components/customerlogin/customerlogin';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
  Outlet
} from "react-router-dom";
import CustomerMenu from './components/customermenu/customermenu';
function App() {
  return (
    <div className="App">
     Welcome to Canteen Management System
     <BrowserRouter>
      <Routes>
        <Route path='/' element={<HomePage />} />
        <Route path="/customerLogin" element={<CustomerLogin />} />
        <Route path="/customerMenu" element={<CustomerMenu />} />
      </Routes>
     </BrowserRouter>
    </div>
  );
}
export default App;
