#!/bin/bash

for D in `jot 10`
do
    curl https://adventofcode.com/2021/day/${D}/input > inputs/day${D}.in
done
