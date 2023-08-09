from flask import Flask, render_template, request, jsonify
import requests

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('login.html')

@app.route('/login', methods=['POST'])
def login():
    username = request.form.get('username')
    password = request.form.get('password')

    login_url = "https://moncompte.carrefour.fr/iam/oauth2/CarrefourConnect/access_token?q=login"
    headers = {
        "Content-Type": "application/x-www-form-urlencoded",
        "User-Agent": "Mozilla/5.0",  # Exemple d'User-Agent, à ajuster si nécessaire
    }
    data = {
        "username": username,
        "password": password
    }

    response = requests.post(login_url, headers=headers, data=data)

    # Affichez le contenu brut de la réponse pour le débogage
    print("Raw response:", response.text)

    # Vérifiez si la réponse est du JSON
    try:
        response_data = response.json()
    except ValueError:
        return jsonify({"status": "error", "message": "Received non-JSON response"}), 400

    if response.status_code == 200:
        token = response_data.get('token')
        if token:
            return jsonify({"status": "success", "token": token}), 200
        else:
            return jsonify({"status": "error", "message": "Token not found in response"}), 400
    elif response.status_code == 401:
        return jsonify({"status": "error", "message": "Unauthorized"}), 401
    elif response.status_code == 403:
        return jsonify({"status": "error", "message": "Forbidden"}), 403
    elif response.status_code == 429:
        return jsonify({"status": "error", "message": "Too many requests, you might be rate-limited"}), 429
    else:
        return jsonify({"status": "error", "message": "Failed to login"}), 400

if __name__ == '__main__':
    app.run(debug=True)
