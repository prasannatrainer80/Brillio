import React, {Component} from 'react';
// import './dropdownex.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as dropdownexActions from "../../store/dropdownex/actions";
export default class DropDownEx extends Component {
    constructor(props) {
        super(props);
        this.state = {value: 'Kavya'};
    }
    handleChange = (event) => {
      let res = event.target.value;
        this.setState({value:event.target.value});
      alert('Selected Student Name is : ' + res);
    }

    render() {
      return <div className="component-dropdownex">
               <form>
        <label>
          Select Student Name :
          <select value={this.state.value} onChange={this.handleChange}>
            <option value="Shubham">Shubham</option>
            <option value="Kavya">Kavya</option>
            <option value="Srikanth">Srikanth</option>
            <option value="Shrivas">Shrivas</option>
          </select>
        </label>
      </form>
        </div>;
    }
  }
// export default connect(
//     ({ dropdownex }) => ({ ...dropdownex }),
//     dispatch => bindActionCreators({ ...dropdownexActions }, dispatch)
//   )( dropdownex );