import React, {Component} from 'react';
import { withRouter } from '../../withRouter';
import  axios  from 'axios';

// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as loginActions from "../../store/login/actions";
export  class CustomerLogin extends Component {
  
  changeUserName(event) {  
    this.setState({  
        userName: event.target.value
    });  
  }
  changePassword(event) {  
    this.setState({  
        passWord: event.target.value
    });  
  }
  login = () => {
    let user = this.state.userName
    let pwd = this.state.passWord
    axios.get("http://localhost:8811/customer/customerLogin/"+user+"/"+pwd)
    .then(response => {
      if (response.data=='1') {
        localStorage.setItem("cuser",user)

        this.props.navigate("/customerMenu")
      }
        console.log(response.data)
    })
  }
  constructor(props) {
        super(props);
        this.state = {
          userName:'',
          passWord:'',
          result : ''
        };
    }
    render() {
      return <div className="component-login">
          <table border="3" align='center'>
            <tr>
              <th colSpan="2">
                Login Page
              </th>
            </tr>
            <tr>
              <th>User Name </th>
              <td>
              <input type="text" id="userName"
                 value={this.state.userName} 
                 onChange={this.changeUserName.bind(this)} />
              </td>
            </tr>
            <tr>
              <th>Password</th>
              <td>
                <input type="password" id="passWord"
                   value={this.state.passWord}
                   onChange={this.changePassword.bind(this)} />
              </td>
            </tr>
            <tr>
              <th colSpan="2">
                <input type="button" value="Login" onClick={this.login} />
              </th>
            </tr>
            </table>
        </div>;
    }
  }
  export default withRouter(CustomerLogin);
// export default connect(
//     ({ login }) => ({ ...login }),
//     dispatch => bindActionCreators({ ...loginActions }, dispatch)
//   )( login );