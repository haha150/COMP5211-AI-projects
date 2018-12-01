# reactiveAgents.py
# ---------------
# Licensing Information:  You are free to use or extend these projects for
# educational purposes provided that (1) you do not distribute or publish
# solutions, (2) you retain this notice, and (3) you provide clear
# attribution to UC Berkeley, including a link to http://ai.berkeley.edu.
# 
# Attribution Information: The Pacman AI projects were developed at UC Berkeley.
# The core projects and autograders were primarily created by John DeNero
# (denero@cs.berkeley.edu) and Dan Klein (klein@cs.berkeley.edu).
# Student side autograding was added by Brad Miller, Nick Hay, and
# Pieter Abbeel (pabbeel@cs.berkeley.edu).

from game import Directions
from game import Agent
from game import Actions
import util
import time
import search

class NaiveAgent(Agent):
    "An agent that goes West until it can't."

    def getAction(self, state):
        "The agent receives a GameState (defined in pacman.py)."
        sense = state.getPacmanSensor();
        print(sense);
        if sense[7]:
            return Directions.STOP;
        else:
            return Directions.WEST;

class PSAgent(Agent):
    "An agent that follows the boundary using production system."

    def getAction(self, state):
        ''' Your code goes here! '''
        ''' [ northwest 0, north 1, northeast 2, east 3, southeast 4, south 5, southwest 6, west 7 ] '''
        sense = state.getPacmanSensor();
        print(sense);
        if sense[7] and not sense[1]:
        	return Directions.NORTH;
        elif sense[5] and not sense[7]:
        	return Directions.WEST;
        elif sense[3] and not sense[5]:
        	return Directions.SOUTH;
        elif sense[1] and not sense[3]:
        	return Directions.EAST;
        elif sense[4]:
        	return Directions.SOUTH;
        elif sense[2]:
        	return Directions.EAST;
        elif sense[0]:
        	return Directions.NORTH;
        elif sense[6]:
        	return Directions.WEST;
        elif not sense[0] and not sense[1] and not sense[2] and not sense[3] and not sense[4] and not sense[5] and not sense[6] and not sense[7]:
        	return Directions.NORTH;
        else:
        	return Directions.STOP;

class ECAgent(Agent):
    "An agent that follows the boundary using error-correction."

    def canMove(self, input, weight):
    	sum = 0;
    	for i, j in zip(input, weight):
    		sum = sum + (i * j);
    	if sum > 0:
    		return 1;
    	else:
    		return 0;

    def getValidMove(self, canMoveNorth, canMoveSouth, canMoveWest, canMoveEast):
        if canMoveNorth == 1:
        	return Directions.NORTH;
        if canMoveSouth == 1:
        	return Directions.SOUTH;
        if canMoveWest == 1:
        	return Directions.WEST;
        if canMoveEast == 1:
        	return Directions.EAST;

    def getAction(self, state):
        ''' Your code goes here! '''
        ''' [ northwest 0, north 1, northeast 2, east 3, southeast 4, south 5, southwest 6, west 7 ] '''
        north = [0.1, -0.2, -0.2, 0.0, 0.0, 0.0, 0.0, 0.1];
        south = [0.0, 0.0, 0.0, 0.1, 0.1, -0.2, -0.2, 0.0];
        west = [-0.2, 0.0, 0.0, 0.0, 0.0, 0.1, 0.1, -0.2];
        east = [0.0, 0.1, 0.1, -0.2, -0.2, 0.0, 0.0, 0.0];
        sense = state.getPacmanSensor();
        print(sense);
        canMoveNorth = self.canMove(sense, north);
        canMoveSouth = self.canMove(sense, south);
        canMoveWest = self.canMove(sense, west);
        canMoveEast = self.canMove(sense, east);
        direction = self.getValidMove(canMoveNorth, canMoveSouth, canMoveWest, canMoveEast);
        valid = 0;
        valid = valid + canMoveNorth;
        valid = valid + canMoveSouth;
        valid = valid + canMoveWest;
        valid = valid + canMoveEast;
        if valid == 1:
        	return direction;
        else:
        	if canMoveNorth == 1:
        		return Directions.NORTH;
        	elif canMoveEast == 1:
        		return Directions.EAST;
        	elif canMoveSouth == 1:
        		return Directions.SOUTH;
        	elif canMoveWest == 1:
        		return Directions.WEST;
        	else:
        		return Directions.NORTH;
    
