/*
 *
 *   Mili2Min - Converte o tempo do computador de milisegundos para hr:min:seg
 *   Copyright (C) 2020 Marlon W. Santos <marlon.santos.santos@icen.ufpa.br>
 *
 *
 *	
 *   This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <https://www.gnu.org/licenses/>
 *
 */


public class Mili2Min{
	static String hora;
	static String minutos;
	static String segundos;
	static double milisegundos;

	public static void main(String[] args) {
		while(true){

			milisegundos=System.currentTimeMillis();
			 
			int hr = (int)((((milisegundos / 1000) / 60) / 60) % 24) - 3 ;

			int min = (int)((milisegundos / 1000) / 60) % 60;

			int seg = (int)(milisegundos/1000) % 60;

			if(seg<10){
				segundos = "0"+Integer.toString(seg);
			}else{
				segundos = Integer.toString(seg);
			}
			if(min<10){
				minutos = "0"+Integer.toString(min);
			}else{
				minutos = Integer.toString(min);
			}
			if(hr<10){
				hora = "0"+Integer.toString(hr);
			}else{
				hora = Integer.toString(hr);
			}
			System.out.println(hora+" : "+minutos+" : "+segundos);
			try{
				Thread.sleep(1000);}
			catch(InterruptedException e){
				System.out.println("erro");
			}
		}
	}
}
