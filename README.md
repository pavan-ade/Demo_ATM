# Demo_ATM
name: Demo of ATM working

on:
  push:
    branches: [ "main" ]
  pull_request:
    branches: [ "main" ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/pavan-ade
    - name: set up JDK 21
  eacho This is demo of atm.
