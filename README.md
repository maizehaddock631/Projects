# Streaming Service Project

This is a Java-based project developed for RSM UK as part of a programming assignment. The goal of this project is to manage and simulate streaming services, films, TV shows, and seasons. It involves creating classes for managing different entities such as streaming services, films, and TV shows, with specific functionality for adding, removing, and managing these objects while ensuring exclusivity of seasons and films across services.

## Project Overview

- **Streaming Services**: The program manages multiple streaming services, where films and TV shows can be added.
- **Films**: Films can be added to one streaming service at a time, with checks to ensure no duplicates (same name and release year) are present.
- **TV Shows and Seasons**: TV shows can be added to multiple streaming services, but individual seasons are exclusive to each service. Each streaming service will only contain one version of a given season for each show.

## Features

- Add and remove films and TV shows to/from streaming services.
- Ensure no duplicates of films exist across services.
- Ensure individual seasons of TV shows are exclusive to a service.
- Provide functionality to view all films and TV shows available on a service.
- Allow for rating films and TV shows.

## Technologies Used

- **Java**
- **BlueJ** (IDE used for development)
