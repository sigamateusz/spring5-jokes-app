package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service
@Primary
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
