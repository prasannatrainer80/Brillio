import React, {Component} from 'react';
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as calcActions from "../../store/calc/actions";
export default class Calc extends Component {
    constructor(props) {
        super(props);
        this.state = {
          firstNo : 0,
          secondNo : 0,
          result : 0
        };
    }

    sum = () => {
      let res = parseInt(this.state.firstNo) + parseInt(this.state.secondNo)
      this.setState({
        result: res 
      })
    }

    sub = () => {
      let res = parseInt(this.state.firstNo) - parseInt(this.state.secondNo)
      this.setState({
        result: res 
      })
    }

    mult = () => {
      let res = parseInt(this.state.firstNo) * parseInt(this.state.secondNo)
      this.setState({
        result: res 
      })
    }
    changeFirstNo(event)  {
      this.setState({
        firstNo : event.target.value 
      })
    }

    changeSecondNo(event) {
      this.setState({
        secondNo : event.target.value 
      })
    }

    changeResult(event) {
      this.setState({
        result : event.target.value 
      })
    }

    render() {
      return <div className="component-calc">
              <table border="3" align='center'>
                 <tr>
                  <th colSpan="2">
                    Calculation Form 
                  </th>
                 </tr>
                  <tr>
                    <th>First Number</th>
                    <td>
                      <input type="number" id="firstNo" 
                        onChange={this.changeFirstNo.bind(this)}
                          value={this.state.firstNo} />
                    </td>
                  </tr>
                  <tr>
                    <th>Second Number</th>
                    <td>
                      <input type="number" id="secondNo" 
                          onChange={this.changeSecondNo.bind(this)}
                          value={this.state.secondNo} />
                    </td>
                  </tr>
                  <tr>
                    <th>Result</th>
                    <td>
                      <input type="number" id="result"
                          onChange={this.changeResult.bind(this)}
                          value={this.state.result} />
                    </td>
                  </tr>
                 <tr>
                   <th colspan="2">
                      <input type="button" value="Sum" onClick={this.sum} /> 
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="button" value="Sub" onClick={this.sub} /> 
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="button" value="Mult" onClick={this.mult} />
                   </th>
                 </tr>
              </table>
            </div>;
    }
  }
// export default connect(
//     ({ calc }) => ({ ...calc }),
//     dispatch => bindActionCreators({ ...calcActions }, dispatch)
//   )( calc );