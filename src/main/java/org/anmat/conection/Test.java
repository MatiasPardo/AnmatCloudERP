package org.anmat.conection;

import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

import com.inssjp.mywebservice.business.MedicamentosDTO;

public class Test {

	public static void main(String[] args) throws MalformedURLException{
		Anmat miAnmat = new Anmat();
		System.out.println(miAnmat.connect().sendMedicamentos(crearMedicamento(), "pruebaws", "Clave1234"));
	}
	
	public static List<MedicamentosDTO> crearMedicamento(){
			
			List<MedicamentosDTO> medicamentos = new LinkedList<MedicamentosDTO>();
			MedicamentosDTO medicamento1 = new MedicamentosDTO();
			medicamento1.setFEvento("25/11/2011");
			medicamento1.setHEvento("04:24");
			medicamento1.setGlnOrigen("glnws");
			medicamento1.setCuitOrigen("20267565393");
			medicamento1.setGlnDestino("glnws");
			medicamento1.setCuitDestino("20267565393");
			medicamento1.setNRemito("1234");
			medicamento1.setNFactura("1234");
			medicamento1.setVencimiento("30/11/2011");
			medicamento1.setGtin("GTIN1");
			medicamento1.setLote("1111");
			medicamento1.setIdEvento("127");
			medicamento1.setApellido("Reingart");
			medicamento1.setNombres("Mariano");
			medicamento1.setTipoDocumento("96");
			medicamento1.setNDocumento("26756539");
			medicamento1.setSexo("M");
			medicamento1.setDireccion("Saraza");
			medicamento1.setLocalidad("Hurlingham");
			medicamento1.setNumero("1234");
			medicamento1.setPiso("");
			medicamento1.setDepto("");
			medicamento1.setNPostal("B1688FDD");
			medicamento1.setProvincia("Buenos Aires");
			medicamento1.setFechaNacimiento("01/01/2000");
			medicamento1.setTelefono("5555-5555");
			medicamentos.add(medicamento1);
	
			return medicamentos;
			
		}
}
