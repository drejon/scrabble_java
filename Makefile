up:
	# docker compose run --rm scrabble gradle clean build
	# docker compose run --rm scrabble

	docker compose up

test:
	docker compose run --rm app-builder mvn test -X

down:
	docker compose down --remove-orphans

build:
	docker compose build