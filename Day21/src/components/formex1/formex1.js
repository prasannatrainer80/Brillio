import React, {Component} from 'react';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as formex1Actions from "../../store/formex1/actions";
export default class FormEx1 extends Component {
    constructor(props) {
        super(props);
        this.state = {
          sname : ''
        };
    }
    showResult = () => {
      alert("Student Name is " +this.state.sname);
    }
    changeSname(event) {
      this.setState({
        sname : event.target.value 
      })
    }

    render() {
      return <div className="component-formex1">
        <form onSubmit={this.showResult}>
          <center>
             Student Name : 
              <input type="text" id="sname" 
                onChange={this.changeSname.bind(this)}
              value={this.state.sname} /> <br/> 
              <input type="submit" value="Show" />
          </center>
        </form>
      </div>;
    }
  }
// export default connect(
//     ({ formex1 }) => ({ ...formex1 }),
//     dispatch => bindActionCreators({ ...formex1Actions }, dispatch)
//   )( formex1 );