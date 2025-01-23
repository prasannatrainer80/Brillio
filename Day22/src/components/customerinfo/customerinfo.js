import React, {Component} from 'react';
import CustomerMenu from '../customermenu/customermenu';
import axios from 'axios';
// import './customerinfo.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerinfoActions from "../../store/customerinfo/actions";
export default class CustomerInfo extends Component {
    constructor(props) {
        super(props);
        this.state = {
          customer : {
          }
        };
    }

    componentDidMount() {
      let user = localStorage.getItem("cuser")
      axios.get("http://localhost:8811/customer/searchByCustomerUserName/"+user)
      .then(response => {
        this.setState({
          customer : response.data
        })
        console.log(response.data)
        localStorage.setItem("cid",response.data.cusId);
      })
    }

    render() {
      const {customer} = this.state
      return <div className="component-customerinfo">
        <CustomerMenu />
        <br/>
        <p>
          Customer Id : <b> {customer.cusId}</b>
        </p>
        <p>
          Customer Name : <b>{customer.cusName} </b>
        </p>
        <p>
          Customer Phone No : {customer.cusPhnNo}
        </p>
        <p>
          Customer User Name : {customer.cusUserName}
        </p>
        <p>
          Customer Password : {customer.cusPassword}
        </p>
        <p>
          Customer Email : {customer.cusEmail}
        </p>
        </div>;
    }
  }
