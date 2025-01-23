import React, {Component} from 'react';
// import './customerorders.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerordersActions from "../../store/customerorders/actions";
export default class customerorders extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-customerorders">Hello! component customerorders</div>;
    }
  }
// export default connect(
//     ({ customerorders }) => ({ ...customerorders }),
//     dispatch => bindActionCreators({ ...customerordersActions }, dispatch)
//   )( customerorders );