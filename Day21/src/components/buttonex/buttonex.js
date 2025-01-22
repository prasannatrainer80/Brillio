import React, {Component} from 'react';
// import './buttonex.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as buttonexActions from "../../store/buttonex/actions";
export default class ButtonEx extends Component {
    constructor(props) {
        super(props);
        this.state = {};
    }
    anoopEvent = () => {
      alert("Hi I am Anoop...")
    }
    render() {
      return <div className="component-buttonex">
        <input type="button" value="Anoop" onClick={this.anoopEvent} /> 
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Navin" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Nitisha" />
      </div>;
    }
  }
// export default connect(
//     ({ buttonex }) => ({ ...buttonex }),
//     dispatch => bindActionCreators({ ...buttonexActions }, dispatch)
//   )( buttonex );