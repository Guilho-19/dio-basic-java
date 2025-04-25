package equipamentos.equipamentos.estabelecimento;

import equipamentos.equipamentos.copiadora.Copiadora;
import equipamentos.equipamentos.digitalizadora.Digitalizadora;
import equipamentos.equipamentos.digitalizadora.Scanner;
import equipamentos.equipamentos.impressora.Impressora;
import equipamentos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
