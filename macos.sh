#!/usr/bin/env bash

which -s brew
if [[ $? != 0 ]] ; then
    # Install Homebrew
    print "Please install homebrew at https://brew.sh/"
    exit 1
else
    brew update
fi

brew install pre-commit

pre-commit install

pre-commit install --hook-type pre-commit
pre-commit install --hook-type commit-msg
