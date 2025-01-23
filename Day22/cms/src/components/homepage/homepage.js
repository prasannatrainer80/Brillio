import React, {Component} from 'react';
import {Link} from "react-router-dom";
// import './homepage.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as homepageActions from "../../store/homepage/actions";
export default class HomePage extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-home-page">
      <Link to="/customerLogin">Customer Login</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/vendorLogin">Vendor Login</Link>
      
      </div>;
    }
  }
// export default connect(
//     ({ homepage }) => ({ ...homepage }),
//     dispatch => bindActionCreators({ ...homepageActions }, dispatch)
//   )( homepage );