package com.jameselsey.demos.projecteuler.problem2;

import com.jameselsey.jameselsey.demos.projecteuler.problem2.Problem2;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class Problem2Test
{
    private Problem2 problem2;

    @Before
    public void setup()
    {
        problem2 = new Problem2();
    }

    @Test
    public void testTheProblem()
    {
        int upperLimit = 100;
        assertThat(Problem2.execute(upperLimit)).isEqualTo(44);
    }
}
