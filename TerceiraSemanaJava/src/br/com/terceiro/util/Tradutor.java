package br.com.terceiro.util;

import java.util.HashMap;

import br.com.terceiro.util.MeuHashMap;

public class Tradutor {

	private static HashMap<Boolean, String> hashMap =
			new MeuHashMap().putCustom(true, "Sim")
			.putCustom(false, "Não");

	public static String traduzir(Boolean b) {

		return hashMap.get(b);
	}
}