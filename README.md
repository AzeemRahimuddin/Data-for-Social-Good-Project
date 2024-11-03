# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

As an environmental activist, I want to analyze different electric cars in the state of Washington based on their model, year and electric range so that I can see which city is the most environmentally friendly.

## Dataset 

Dataset: https://www.kaggle.com/datasets/mariusborel/electric-vhicule-population-data
- **City** (String) - name of the city. 
- **Model Year ** (int) - The year the car was released . 
- **Make** (String ) - The brand of the car. 
- **Model** (String) - The type of car. 
- **Electric Range** (int) - The distance the car can travel. 

## UML Diagram 

<img width="1013" alt="Screenshot 2024-11-02 at 9 58 01 PM" src="https://github.com/user-attachments/assets/0ed18d05-5c2a-4c8d-b426-40631b358531">


## Description 
My project analzyes specific data from a dataset to determine which city in the state of Washington is the most enviromentally friendly based on the number of Electric vehicles. I have selected a data set that had a total of 205,000 registered electric cars in the state, but narrowed it down to the first 10,000 in the data set. The first 10,000 results included the location (city), the Model Year of the car, the brand of the car (make), the Model of the car (brand) and the Electric Range it had. We had to sort the data to find car models that were older than 5 years old by using loops.  My project achieved its answer to the userStory and was able to do this with multiple 1D arrays, methods and constructors. 
