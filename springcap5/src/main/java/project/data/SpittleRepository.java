package project.data;

/**
 * Created by sg-0036936 on 24/05/2017.
 */
import java.util.List;

import project.model.Spittle;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}