package project.data;

import project.model.Spitter;

/**
 * Created by sg-0036936 on 27/05/2017.
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}