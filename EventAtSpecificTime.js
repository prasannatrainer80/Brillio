import React, { useEffect } from 'react';

const EventAtSpecificTime = () => {

 const timeToAlert = () => {
    alert("Hi I am On...")
 }
  useEffect(() => {

   
    var timeIsBeing936 = new Date("02/13/2025 03:57:00 PM").getTime()
    , currentTime = new Date().getTime()
    , subtractMilliSecondsValue = timeIsBeing936 - currentTime;
    setTimeout(timeToAlert, subtractMilliSecondsValue);
   });
   return(
    <div>
        It will Alert at 3.57 PM
    </div>
   )
}
export default EventAtSpecificTime;