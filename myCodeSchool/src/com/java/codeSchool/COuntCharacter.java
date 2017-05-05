package com.corejavaB;

public class COuntCharacter {

	public static void main(String[] args) {

		String str = " Hello how are you";
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

		for (int in = 0; in < str.length(); in++) {
			String value = String.valueOf(str.charAt(in)).toLowerCase();
			System.out.println(value);
			switch (value) {
			case "a":
				a = a + 1;
				break;
			case "b":
				b = b + 1;
				break;
			case "c":
				c = c + 1;
				break;
			case "d":
				d = d + 1;
				break;
			case "e":
				e = e + 1;
				break;
			case "f":
				f = f + 1;
				break;
			case "g":
				g = g + 1;
				break;
			case "h":
				h = h + 1;
				break;
			case "i":
				i = i + 1;
				break;
			case "j":
				j = j + 1;
				break;
			case "k":
				k = k + 1;
				break;
			case "l":
				l = l + 1;
				break;
			case "m":
				m = m + 1;
				break;
			case "n":
				n = n + 1;
				break;
			case "o":
				o = o + 1;
				break;
			case "p":
				p = p + 1;
				break;
			case "q":
				q = q + 1;
				break;
			case "r":
				r = r + 1;
				break;
			case "s":
				s = s + 1;
				break;
			case "t":
				t = t + 1;
				break;
			case "u":
				u = u + 1;
				break;
			case "v":
				v = v + 1;
				break;
			case "w":
				w = w + 1;
				break;
			case "x":
				x = x + 1;
				break;
			case "y":
				y = y + 1;
				break;
			case "z":
				z = z + 1;
				break;
			default:
				break;

			}

		}
		System.out.println("a : " + a + " ,b : " + b + " ,c : " + c + " ,d : " + d +" , h : "+h);
	}

}
