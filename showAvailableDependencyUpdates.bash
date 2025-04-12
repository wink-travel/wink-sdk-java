#!/bin/bash

#
# Copyright (c) 2013-2024 Wink.
#
echo "Show new available versions for 3rd party libraries."

echo "Updating spring boot parent."
mvn versions:display-dependency-updates
