package workflow.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;
import workflow.domain.Ticket;
import workflow.repository.TicketRepository;
import workflow.utilities.CommonUtilities;

import javax.validation.constraints.AssertTrue;
import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sramalin on 13/06/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TicketServiceTest {


    @Mock
    private CommonUtilities commonUtilities;
    @Mock
    private TicketRepository ticketRepository;
    @InjectMocks
    private TicketService ticketService;



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAllTickets() throws Exception {
        System.out.println(ticketService.getAllTickets());
    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void getTicketsByName() throws Exception {

    }

    @Test
    public void updateTicket() throws Exception {

    }

    @Test
    public void deleteTicket() throws Exception {

    }

    @Test
    public void shouldReturnTrueWhenbulkUploadIsCalledWithNonEmptyFile() throws Exception {

        byte[] bytes = new byte[1];
        assertTrue(ticketService.bulkUpload(bytes));

    }
    @Test
    public void shouldReturnFalseWhenbulkUploadIsCalledWithEmptyFile() throws Exception {

        byte[] bytes = new byte[0];
        assertFalse(ticketService.bulkUpload(bytes));

    }

}