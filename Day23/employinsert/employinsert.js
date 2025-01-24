import React, {Component} from 'react';
// import './employinsert.scss'
import axios from 'axios';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as employinsertActions from "../../store/employinsert/actions";
export default class EmployInsert extends Component {
    constructor(props) {
        super(props);
        this.state = {
          empno : 0,
          name : '',
          gender : '',
          dept : '',
          desig : '',
          basic : 0
        };
    }

    addEmploy = () => {
      let eno = this.state.empno
      let nam = this.state.name 
      let gen = this.state.gender 
      let dpt = this.state.dept 
      let dsg = this.state.desig 
      let bas = this.state.basic

      axios.post("http://localhost:8282/employ/addEmploy",{
        empno:eno,
        name:nam,
        gender:gen,
        dept:dpt,
        desig:dsg,
        basic:bas
      }).then(function (response) {
        alert(response.data)
        console.log(response.data)
      })
    }

    handleInputChange = ({target : {name, value}}) => {
      this.setState({ [name] : value});
    }


    // changeEmpno(event){
    //   this.setState({
    //     empno : event.target.value 
    //   })
    // }

    // changeName(event) {
    //   this.setState({
    //     name : event.target.value
    //   })
    // }

    // changeGender(event) {
    //   this.setState({
    //     gender : event.target.value 
    //   })
    // }

    // changeDept(event) {
    //   this.setState({
    //     dept : event.target.value
    //   })
    // }

    // changeDesig(event) {
    //   this.setState({
    //     desig : event.target.value 
    //   })
    // }

    // changeBasic(event) {
    //   this.setState({
    //     basic : event.target.value
    //   })
    // }
    render() {
      return <div className="component-employinsert">
          <table border="3" align="center">
            <tr>
              <th colspan="2">Add Employ</th>
            </tr>
            <tr>
              <th>Employ No</th>
              <td>
                <input type="number" name="empno" value={this.state.empno} 
                    onChange={this.handleInputChange}
                />
              </td>
            </tr>
            <tr>
              <th>Employ Name</th>
              <td>
                <input type="text" name="name" value={this.state.name}
                  onChange={this.handleInputChange} />
              </td>
            </tr>
            <tr>
              <th>Gender</th>
              <td>
                <input type="text" name="gender" value={this.state.gender}
                  onChange={this.handleInputChange} />
              </td>
            </tr>
            <tr>
              <th>Department</th>
              <td>
                <input type="text" name="dept" value={this.state.dept}
                  onChange={this.handleInputChange} />
              </td>
            </tr>
            <tr>
              <th>Designation</th>
              <td>
                <input type="text" name="desig" value={this.state.desig}
                  onChange={this.handleInputChange} />
              </td>
            </tr>
            <tr>
              <th>Basic</th>
              <td>
                <input type="number" name="basic" value={this.state.basic}
                  onChange={this.handleInputChange} />
              </td>
            </tr>
            <tr>
              <th colspan="2">
                <input type="button" value="Add Employ"
                  onClick={this.addEmploy} />
              </th>
            </tr>
          </table>
        </div>;
    }
  }
