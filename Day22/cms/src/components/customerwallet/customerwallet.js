import React, {Component} from 'react';
// import './customerwallet.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerwalletActions from "../../store/customerwallet/actions";
export default class customerwallet extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-customerwallet">Hello! component customerwallet</div>;
    }
  }
// export default connect(
//     ({ customerwallet }) => ({ ...customerwallet }),
//     dispatch => bindActionCreators({ ...customerwalletActions }, dispatch)
//   )( customerwallet );