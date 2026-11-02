package ch6.practice2_todo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class TodoBusinessImplTest {

    @Test
    void retrieveTodosRelatedToSpringTest() {
        // TODO: test TodoBusinessImpl.retrieveTodosRelatedToSpring(user)
        // Hint: mock TodoService and make retrieveTodos(anyString()) return a list
        //       with a mix of "Spring" and other todos. Assert only "Spring" comes back.
    }

    @Test
    void deleteTodosNotRelatedToSpring() {
        // TODO: test TodoBusinessImpl.deleteTodosNotRelatedToSpring(user)
        // Hint: this method returns nothing, so use verify(mock, times(n)).deleteTodo(...)
        //       to check which todos were deleted and which were not (times(0) or never()).
    }
}
