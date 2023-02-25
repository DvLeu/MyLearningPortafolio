import numpy as np
import matplotlib.pyplot as plt

# Definir una señal discreta
N = 1000  # Número de puntos
t = np.linspace(0, 2*np.pi, N)  # Vector de tiempo
x = np.sin(5*t) + np.sin(10*t)  # Señal discreta

# Calcular la serie de Fourier
k = np.arange(-N/2, N/2)  # Vector de frecuencias
X = np.fft.fft(x) / N  # Transformada de Fourier discreta normalizada
X = np.fft.fftshift(X)  # Reordenar los coeficientes

# Graficar la señal y la serie de Fourier
plt.subplot(211)
plt.plot(t, x)
plt.xlabel('Tiempo')
plt.ylabel('Señal')
plt.subplot(212)
plt.plot(k, np.abs(X))
plt.xlabel('Frecuencia')
plt.ylabel('Amplitud')
plt.show()