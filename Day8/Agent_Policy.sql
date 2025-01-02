use brillio;

Create Table AgentPolicy
(
    AgentID INT,
    PolicyID INT,
    IsSplitAgent INT,
    Foreign KEY(AGentID) REFERENCES Agent(AgentID),
    FOREIGN KEY(PolicyID) REFERENCES Policy(PolicyID),
    Primary Key(AgentID, PolicyID)
);


Insert into AgentPolicy
values(1,1,0),(1,2,0),(2,1,0),(2,3,0),
(4,5,0),(3,3,0);