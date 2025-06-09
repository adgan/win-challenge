# Win Challenge

Win Challenge is a project that creates personalized gaming challenges based on your Steam library and your friends' libraries. It leverages game lookups and AI-powered challenge generation to suggest fun and engaging tasks for you and your friends to complete in your owned games.

## Features

- Connects to your Steam account to fetch your game library.
- Analyzes your friends' Steam libraries for shared games.
- Uses AI to generate creative and unique challenges for selected games.
- Provides a platform to track and share completed challenges.

## How it Works

1. **Steam Integration**: Import your Steam library and optionally your friends' libraries.
2. **Game Lookup**: The system identifies games you and your friends own.
3. **AI Challenge Generation**: For each game, the AI generates tailored challenges based on game mechanics and your preferences.
4. **Challenge Tracking**: Accept, complete, and share your progress with friends.

## Getting Started

1. Clone the repository.
2. Install dependencies.
3. Configure your Steam API key.
4. Run the application and connect your Steam account.

## Tech Stack

- **Backend:** Spring Boot, MongoDB, Spring AI
- **Frontend:** React, TypeScript, Vite
- **AI Integration:** Mistral AI (via Spring AI)
- **Testing:** JUnit, Testcontainers

## License

MIT License

