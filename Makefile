up:
	docker compose up

test:
	docker compose run --rm app-builder mvn test

down:
	docker compose down

build:
	docker compose build