up:
	docker compose run --rm scrabble gradle build --continuous

run:
	docker compose run --rm scrabble

test:
	docker compose run --rm app-builder mvn test -X

down:
	docker compose down --remove-orphans

build:
	docker compose build
