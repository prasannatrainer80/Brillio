import logo from './logo.svg';
import './App.css';
import HomePage from './components/homepage/homepage';
import CustomerLogin from './components/customerlogin/customerlogin';
import CustomerInfo from './components/customerinfo/customerinfo';
import CustomerWallet from './components/customerwallet/customerwallet';
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
        <Route path="/customerInfo" element={<CustomerInfo />} />
        <Route path="/customerWallet" element={<CustomerWallet />} />
      </Routes>
     </BrowserRouter>
    </div>
  );
}
export default App;
