import React, {Component} from 'react';
// import './show.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as showActions from "../../store/show/actions";
export default class Show extends Component {
    constructor(props) {
        super(props);
        this.state = {
          firsName : 'Prasanna',
          lastName : 'P'
        };
    }
    render() {
      return <div className="component-show">
        First Name : <b>{this.state.firsName}</b> <br/>
        Last Name : <b>{this.state.lastName}</b>
        </div>;
    }
  }
// export default connect(
//     ({ show }) => ({ ...show }),
//     dispatch => bindActionCreators({ ...showActions }, dispatch)
//   )( show );