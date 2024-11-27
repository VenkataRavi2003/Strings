import numpy as np
import matplotlib.pyplot as plt

# Dataset
X = np.array([1, 2, 3, 4, 5])
y = np.array([2, 4, 5, 4, 5])

# Calculate coefficients
n = len(X)
X_mean = np.mean(X)
y_mean = np.mean(y)

numerator = sum((X - X_mean) * (y - y_mean))
denominator = sum((X - X_mean) ** 2)

m = numerator / denominator  # Slope
c = y_mean - m * X_mean      # Intercept

# Regression line equation
def predict(x):
    return m * x + c

# Generate regression line
X_line = np.linspace(min(X), max(X), 100)
y_line = predict(X_line)

# Plot the data points
plt.scatter(X, y, color='blue', label='Data Points')

# Plot the regression line
plt.plot(X_line, y_line, color='red', label='Regression Line')

# Highlight the prediction for X=6
plt.scatter(6, predict(6), color='green', label='Prediction for X=6')
plt.annotate(f"({6}, {predict(6):.2f})", (6, predict(6)), textcoords="offset points", xytext=(-15, 10), ha='center')

# Add labels and legend
plt.xlabel('X')
plt.ylabel('y')
plt.title('Linear Regression')
plt.legend()

# Display the plot
plt.grid()
plt.show()
