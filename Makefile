init:
	asdf install
	asdf local clojure 1.10.3

core:
	clojure -m advent-of-code-2021.core

get-inputs:
	./scripts/get-inputs.sh

inputs/day1.in: get-inputs

day1: inputs/day1.in
	clojure -m advent-of-code-2021.day1

day2: inputs/day2.in
	clojure -m advent-of-code-2021.day2

day3: inputs/day3.in
	clojure -m advent-of-code-2021.day3

day4: inputs/day4.in
	clojure -m advent-of-code-2021.day4
