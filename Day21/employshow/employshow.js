import React, {Component} from 'react';
import axios from 'axios';
export default class EmployShow extends Component {
    constructor(props) {
        super(props);
        this.state = {
          employs : []
        };
    }
    componentDidMount() {
        axios.get("http://localhost:8282/employ/showEmploy")
        .then(response => {
          this.setState({
            employs : response.data
          })
          console.log(response.data)
        })
    }

    render() {
      const {employs} = this.state
      return <div className="component-employshow">
        <table border="3" align="center">
          <tr>
            <th>Employ No</th>
            <th>Employ Name</th>
            <th>Gender</th>
            <th>Department</th>
            <th>Designation</th>
            <th>Basic</th>
          </tr>
          {
            employs.map(employ =>
              <tr>
                <td>{employ.empno}</td>
                <td>{employ.name}</td>
                <td>{employ.gender}</td>
                <td>{employ.dept}</td>
                <td>{employ.desig}</td>
                <td>{employ.basic}</td>
              </tr>
            )
          }
        </table>
      </div>;
    }
  }
