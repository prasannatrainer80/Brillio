import React, {Component} from 'react';
import axios from 'axios';
export default class EmploySearch extends Component {
    constructor(props) {
        super(props);
        this.state = {
          employ : {}
        };
    }

    handleChange = (event) => {
      this.setState({value : event.target.value})
    }

    handleSubmit = () => {
      const {employ} = this.state
      axios.get("http://localhost:8282/employ/searchEmploy/" + this.state.value)
      .then(response => {
        this.setState({
          employ : response.data
        })
        console.log(employ)
      })
    }
    render() {
      const {employ} = this.state
      return <div className="component-employsearch">
          <form>
            Employ No : 
            <input type="number" value={this.state.value} onChange={this.handleChange} />
            <br/><br/>
            <input type="button" value="Search" onClick={this.handleSubmit} />
            <br/>
            <hr/>
          </form>
          Employ No : {employ.empno} <br/>
            Employ Name : {employ.name} <br/>
            Gender : {employ.gender} <br/>
            Department : {employ.dept} <br/>
            Designation : {employ.desig} <br/>
            Basic : {employ.basic} <br/>
        </div>;
    }
  }
