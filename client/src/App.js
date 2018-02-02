import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';


class App extends Component {

    constructor(props: any) {
        super(props);

        this.state = {
            beers: [],
            isLoading: false
        };
    }

    render() {

        const {beers, isLoading} = this.state;

        if (isLoading) {
            return <p>Loading...</p>;
        }

        return (
            <div className="App">
                <div className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <h2>Welcome to React</h2>
                </div>
                <div>
                    <h2>Products List</h2>
                    {beers.map((beer: any) =>
                        <div key={beer.imeiNumber}>
                            {beer.productName}
                        </div>
                    )}
                </div>
            </div>
        );
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('http://localhost:8080/api/v1/product')
            .then(response => response.json())
            .then(data => this.setState({beers: data, isLoading: false}));
    }
}

export default App;
