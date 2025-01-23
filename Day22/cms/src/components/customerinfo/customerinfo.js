import React, {Component} from 'react';
// import './customerinfo.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as customerinfoActions from "../../store/customerinfo/actions";
export default class customerinfo extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = {};
    // }
    render() {
      return <div className="component-customerinfo">Hello! component customerinfo</div>;
    }
  }
// export default connect(
//     ({ customerinfo }) => ({ ...customerinfo }),
//     dispatch => bindActionCreators({ ...customerinfoActions }, dispatch)
//   )( customerinfo );