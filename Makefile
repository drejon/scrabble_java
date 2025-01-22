up:
	docker compose run --rm app-builder mvn clean
	docker compose up --no-attach app-builder

test:
	docker compose run --rm app-builder mvn test -X

down:
	docker compose down

build:
	docker compose build