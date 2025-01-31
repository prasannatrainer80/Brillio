import React from "react";

export const themes = {
    light: {
      background: "yellow",
      text: "purple",
    }
};


export const ColorContext = React.createContext(themes.light);