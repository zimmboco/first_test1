package hashTag;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTagImplTest {
    HashTag hashTag = new HashTagImpl();
    List<String> str;

    @BeforeEach
    void setUp() {
        str = new ArrayList<>();
        str.add("#num #num asdfasdf  #num #numbers asdfasdf #numbers asdfasdf #num");
        str.add("#num asdfasdf #num asdfasdf #num #numbers asdfasdf #numbers #num");
        str.add("#enum asdfasdf #num #enum #numbers asdfasdf #numbers #enum");
        str.add("#enum #list asdfasdf #enum #numbers #list #enum");
        str.add("#array #num #array asdfasdf #array #numbers #enum");
        str.add("#size #num #array #size asdfasdf #numbers #enum");
    }

    @Test
    void correctReturn_Ok() {
        List<Result> expected = new ArrayList<>();
        expected.add(new Result("#numbers", 6));
        expected.add(new Result("#num", 5));
        expected.add(new Result("#enum", 4));
        expected.add(new Result("#array", 2));
        expected.add(new Result("#size", 1));
        List<Result> actual = hashTag.hashTag(str);
        assertEquals(expected, actual);
    }

    @Test
    void inputNullInMethod_Ok() {
        assertThrows(NullPointerException.class,
                () -> hashTag.hashTag(null), "Must throw NullPointer");
    }
}