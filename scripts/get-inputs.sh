#!/bin/bash

for D in `jot 10`
do
    if [ -z inputs/day${D}.in ]
    then
        curl https://adventofcode.com/2021/day/${D}/input > inputs/day${D}.in
    fi
done
