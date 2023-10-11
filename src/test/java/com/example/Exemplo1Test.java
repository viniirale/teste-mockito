package com.example;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;




@ExtendWith(MockitoExtension.class)
public class Exemplo1Test 
{
    @Mock
    DescontoService desconto;

    @Test
    public void teste1()
    {
        Pedido pedidoMock = Mockito.mock(Pedido.class);
        Mockito.when(pedidoMock.calcularValorTotal()).thenReturn(10.0);
        assertEquals(10.0, pedidoMock.calcularValorTotal());
    }
}
