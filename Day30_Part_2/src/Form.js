import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { submitForm } from './store';
import './App.css'

const Form = () => {
  const dispatch = useDispatch();
  const [formData, setFormData] = useState({});

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = () => {
    dispatch(submitForm(formData));
    setFormData({});
  };

  return (
    <div id='app'>
      <div id='head'>
        <h1>Simple Form Application</h1>
      </div>
      <div id='form'>
        <input type="text" name="name" placeholder="Name" onChange={handleChange} value={formData.name || ''} />
        <input type="email" name="email" placeholder="Email" onChange={handleChange} value={formData.email || ''} />
        <textarea name="message" placeholder="Write Message Here" onChange={handleChange} value={formData.message || ''} />
        <button onClick={handleSubmit}>Submit</button>
      </div>
    </div>
  );
};

export default Form;