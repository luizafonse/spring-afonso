package br.com.fatec.spring_afonso;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import br.com.fatec.spring_afonso.controller.ReturnNomeController;

@WebMvcTest({ReturnNomeController.class})
public class RetunrNomeControllerTest {
   @Autowired
   private MockMvc mockMvc;
   @Test
   public void ReturnNomeControllerTest() {
   }
   public void testMeuNome() throws Exception {
      this.mockMvc.perform(MockMvcRequestBuilders.get("/meu-nome", new Object[0])).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Afonso Luiz Soares Batista"));
   }
}
