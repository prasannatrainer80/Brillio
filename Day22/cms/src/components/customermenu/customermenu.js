import React, {Component} from 'react';
import {
  Link
} from "react-router-dom";
export default class CustomerMenu extends Component {
   
    render() {
      return <div className="component-customermenu">
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerInfo">Customer Info</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerWallet">Customer Wallet</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerOrders">Customer Orders</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerPendingOrders">Customer Pending Orders</Link>
        </div>;
    }
  }
// export default connect(
//     ({ customermenu }) => ({ ...customermenu }),
//     dispatch => bindActionCreators({ ...customermenuActions }, dispatch)
//   )( customermenu );