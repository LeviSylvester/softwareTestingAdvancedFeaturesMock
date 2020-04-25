import model.Todo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.junit.jupiter.MockitoExtension;
import service.DataRetriever;
import service.OperationsSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OperationsSystemTest {

    @Mock
    DataRetriever dataRetrieverMock;

    @Test
    public void verifyMock() {
        dataRetrieverMock.getData();
        verify(dataRetrieverMock).getData();
    }

    @Test
    public void verifySumOfUserIdFiveAndIdTen() {
        //given
        Todo todo = new Todo(5, 10, "Cumparaturi", false);
        when(dataRetrieverMock.getData()).thenReturn(todo);
        OperationsSystem operationsSystem = new OperationsSystem(dataRetrieverMock);
        //when
        int result = operationsSystem.getSumOfUserIdAndId();
        //then
        assertEquals(15, result);
    }

    @Test
    public void verifyGetMemoriesTitleWithPrefix() {
        //given
        Todo todo = new Todo();
        todo.setTitle("Memories");
        when(dataRetrieverMock.getData()).thenReturn(todo);
        OperationsSystem operationsSystem = new OperationsSystem(dataRetrieverMock);
        //when
        String myTitleWithPrefix = operationsSystem.getTitleWithPrefix("xx");
        //then
        assertEquals("xxMemories", myTitleWithPrefix);
    }
}
