import React, {Component} from 'react';
import axios from 'axios';
// import './usershow.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as usershowActions from "../../store/usershow/actions";
export default class usershow extends Component {

    constructor(props) {
        super(props);
        this.state = {
          users : []
        };
    }

    componentDidMount() {
      axios.get("https://jsonplaceholder.typicode.com/users")
      .then(response => {
        this.setState({
          users : response.data
        })
      })
    }
    render() {
      const {users} = this.state
      return <div className="component-usershow">
        <table border="3" align="center">
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>UserName</th>
              <th>Email</th>
              <th>Phone</th>
              <th>Website</th>
            </tr>
            {
              users.map(user =>
                <tr>
                  <td>{user.id}</td>
                  <td>{user.name}</td>
                  <td>{user.username}</td>
                  <td>{user.email}</td>
                  <td>{user.phone}</td>
                  <td>{user.website}</td>
                </tr>
               )
            }
        </table>
      </div>;
    }
  }
// export default connect(
//     ({ usershow }) => ({ ...usershow }),
//     dispatch => bindActionCreators({ ...usershowActions }, dispatch)
//   )( usershow );